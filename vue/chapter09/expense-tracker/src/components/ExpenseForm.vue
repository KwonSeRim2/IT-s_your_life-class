<template>
  <div>
    <span>
      <input
        type="text"
        style="
          background-color: #1e1e1e;
          color: white;
          padding: 10px;
          margin: 5px;
          border-radius: 7px;
        "
        v-model="item"
        placeholder="항목명 입력"
      />
    </span>
    <span
      ><input
        type="text"
        style="
          background-color: #1e1e1e;
          color: white;
          padding: 10px;
          margin: 5px;
          border-radius: 7px;
        "
        v-model="amount"
        placeholder="0"
    /></span>
    <span
      ><button
        type="submit"
        style="padding: 8px; border-radius: 5px; background-color: aquamarine"
        @click="emit('submit1', item, amount)"
      >
        추가
      </button></span
    >
  </div>
</template>
<script setup>
import { ref } from 'vue';
const item = ref('');
const amount = ref();

const emit = defineEmits(['submit1']);
</script>
