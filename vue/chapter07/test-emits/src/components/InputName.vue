<template>
  <div style="border: solid 1px gray; padding: 5px">
    이름: <input type="text" v-model="name" />
    <!-- nameChanged라는 이벤트명으로 name을 객체로 감써서 부모 컴포넌트로 전달 -->
    <button @click="$emit('nameChanged', { name })">이벤트 발신</button>
  </div>
</template>

<script>
export default {
  name: 'InputNmea',
  //emits: ['nameChanged1'],//nameChanged1 이외의 이벤트 발생시 경고 출력
  // emits: {
  //   nameChanged: (e) => {
  //     return e.name && typeof e.name === 'string' && e.name.trim().length >= 3
  //       ? true
  //       : false;
  //   },
  // },
  data() {
    return {
      name: '',
    };
  },
};
</script>
