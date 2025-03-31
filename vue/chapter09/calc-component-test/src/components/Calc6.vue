<template>
  <div>
    X: <input type="text" v-model.number="state.x" /> <br />
    <div>결과 : {{ state.result }}</div>
  </div>
</template>

<script>
import { computed, reactive, ref, watch } from 'vue';

export default {
  name: 'Calc6',
  setup() {
    const state = reactive({ x: 0, result: 0 });
    // 기본형 ㄷ데이터는 watch에서
    watch(
      () => state.x,
      (current, old) => {
        console.log();
        state.result = current * 2;
      }
    );
    return { state };
    //템플릿에서 사용하기 위해 값리턴
  },
};
</script>
