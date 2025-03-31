<template>
  <div
    style="
      background-color: #1e1e1e;
      padding: 10px;
      margin: 10px;
      border-radius: 10px;
      text-align: center;
    "
  >
    <div style="margin: 10px">😥총지출: ₩{{ formatNumber(total) }}</div>
  </div>
</template>
<script setup>
import {} from 'vue';
const props = defineProps({
  total: {
    type: Number,
    require: true,
  },
  formatNumber: {
    type: Function,
    require: true,
  },
});
</script>
