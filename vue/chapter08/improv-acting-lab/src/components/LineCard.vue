<template>
  <div style="margin-left: 45px; border: 2px solid black; margin-top: 20px">
    <div class="body">{{ currentLine.line }}</div>
    <div class="body">
      <button
        style="
          background-color: cadetblue;
          padding: 10px;
          text-align: center;
          border: none;
          border-radius: 7px;
        "
        @click="$emit('RandomLineProvider', { line: random() })"
      >
        랜덤 대사 뽑기
      </button>
    </div>
    <div class="body tip"><slot name="tip"></slot></div>
    <div class="body" style="margin: 20px"><slot name="image"></slot></div>
    <div class="body"><slot></slot></div>
  </div>
</template>
<script>
export default {
  name: 'LineCard',
  inject: ['lines'],
  methods: {
    random() {
      let n = 0;

      n = Math.floor((Math.random() * 10) % 5);
      console.log(n);

      return this.lines[n];
    },
  },
  props: ['currentLine'],
};
</script>
<style scoped>
.body {
  text-align: center;
  margin-top: 20px;
}
.tip {
  margin: 20px;
  background-color: rgb(230, 249, 255);
  padding: 10px;
  border-radius: 10px;
}
</style>
