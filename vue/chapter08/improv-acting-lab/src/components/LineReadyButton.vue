<template>
  <div class="container">
    <button class="mt-5" @click="$emit('ready', {})">🎬대사 준비 완료!</button
    ><br />
    <slot>여기에 서윤이의 코멘트가 들어갑니다.</slot>
  </div>
</template>
<script>
export default {
  name: 'LineReadyButton',

  data() {
    return {};
  },
  props: ['count'],
};
</script>
<style scoped>
button {
  color: white;
  margin-left: 120px;
  width: 300px;
  height: 50px;
  background-color: #ff7675;
  border-radius: 12px;
  text-align: center;
}
.over {
  background-color: #d63031;
}
</style>
