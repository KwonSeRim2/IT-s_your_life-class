import { ref, computed, reactive } from 'vue';
import { defineStore } from 'pinia';
import axios from 'axios';

const initState = {
  token: '',
  user: {
    username: '',
    email: '',
    roles: [],
  },
};

export const useAuthStore = defineStore('auth', () => {
  const state = ref({ ...initState });
  //로그인 여부, 강제로 boolean 형변환
  const isLogin = computed(() => !!state.value.user.username);
  const username = computed(() => state.value.user.username);
  const email = computed(() => state.value.user.email);

  const login = async (menubar) => {
    state.value.token = 'test token';
    state.value.user = {
      username: member.username,
      email: menubar.username + '@test.com',
    };

    //api호출
    const { data } = await axios.post('/api/auth/login', member); //백: loginsuccesshandler
    state.value = { ...data };

    //auth라는 키에 json 직렬화
    localStorage.setItem('auth', JSON.stringify(state.value));
  };

  const logout = () => {
    localStorage.clear();
    state.value = { ...initState };
  };

  //토큰 조회 함수
  const getToken = () => state.value.token;

  const load = () => {
    const auth = localStorage.getItem('auth');
    if (auth != null) {
      //로컬스토리지에 있던 데이터 역직렬화
      state.value = JSON.parse(auth);
      console.log(state.value);
    }
  };

  load(); //기동시

  return { state, username, email, isLogin, login, logout, getToken };
});
