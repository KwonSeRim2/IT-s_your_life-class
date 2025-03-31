<template>
  <div>
    X: <input type="text" v-model.number="state.x" /> <br />
    Y: <input type="text" v-model.number="state.y" /> <br />
    <button @click="calcAdd">계산</button><br />
    <div>결과 : {{ state.result }}</div>
  </div>
</template>

<script>
import { reactive, ref } from 'vue';

export default {
  name: 'Calc',
  setup() {
    //기본 형 데이터는 반ㅇ능성ㅇ르 띄기 위해 ref로 갑싸준다
    const state = reactive({ x: 10, y: 20, result: 30 });

    const calcAdd = () => {
      state.result = state.x + state.y;
    };
    return { state, calcAdd };
    //템플릿에서 사용하기 위해 값리턴
  },
};
</script>
