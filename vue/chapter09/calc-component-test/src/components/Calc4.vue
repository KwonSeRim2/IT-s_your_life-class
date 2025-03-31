<template>
  <div>
    X: <input type="text" v-model.number="state.x" /> <br />
    Y: <input type="text" v-model.number="state.y" /> <br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
import { computed, reactive, ref } from 'vue';

export default {
  name: 'Calc',
  setup() {
    //기본 형 데이터는 반ㅇ능성ㅇ르 띄기 위해 ref로 갑싸준다
    const state = reactive({ x: 10, y: 20 });

    const result = computed(() => {
      return state.x + state.y;
    });
    return { state, result };
    //템플릿에서 사용하기 위해 값리턴
  },
};
</script>
