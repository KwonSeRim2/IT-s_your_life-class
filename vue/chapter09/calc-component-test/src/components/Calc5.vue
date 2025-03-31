<template>
  <div>
    X: <input type="text" v-model.number="x" /> <br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
import { computed, reactive, ref, watch } from 'vue';

export default {
  name: 'Calc5',
  setup() {
    const x = ref(0);
    const result = ref(0);

    // watch(감시하려는 데이터, 처리 함수)
    // watch는 변경 전후 데이터를 처리 가능
    // 받아온 데이터는 모드 .value저리 되어있음
    watch(x, (current, old) => {
      console.log();
      result.value = current * 2;
    });
    return { x, result };
    //템플릿에서 사용하기 위해 값리턴
  },
};
</script>
