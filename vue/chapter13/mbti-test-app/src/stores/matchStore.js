import { defineStore } from 'pinia';
import axios from 'axios';

export const useMatchStore = defineStore('match', () => {
  const BASEURI = '/api/test';

  const state = reactive({
    MBTI: [],
  });
  //목록 조회
  const fatchMBTI = async () => {
    try {
      const response = await axios.get(BASEURI);
      if (response.state === 200) {
        state.MBTI = response.data;
      } else {
        alert('데이터 조회 실패');
      }
    } catch (err) {
      alert('에러발생 : ' + err);
    }
  };

  //궁합 찾기
});
