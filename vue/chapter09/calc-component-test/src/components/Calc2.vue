<template>
  <div>
    X: <input type="text" v-model.number="x" /> <br />
    Y: <input type="text" v-model.number="y" /> <br />
    <button @click="calcAdd">계산</button><br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
import { ref } from 'vue';

export default {
  name: 'Calc',
  setup() {
    //기본 형 데이터는 반ㅇ능성ㅇ르 띄기 위해 ref로 갑싸준다
    const x = ref(10);
    const y = ref(20);
    const result = ref(30);

    const calcAdd = () => {
      result.value = x.value + y.value;
    };
    return { x, y, result, calcAdd };
    //템플릿에서 사용하기 위해 값리턴
  },
};
</script>
