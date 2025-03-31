<template>
  <div>
    <ul style="margin: 5px; padding: 0">
      <li
        class="d-flex"
        style="
          background-color: #1e1e1e;
          margin: 5px;
          border-radius: 5px;
          padding: 8px;
          list-style: none;
        "
        v-for="(item, index) in exList.exItems"
        :key="index"
      >
        {{ imo(item) }}{{ item.item }} : {{ formatNumber(item.amount) }}원
        <div class="flex-grow-1"></div>
        <button
          class="d-flex justify-content-end"
          style="background-color: #1e1e1e"
          @click="emit('delete', { index })"
        >
          ❌
        </button>
      </li>
    </ul>
  </div>
</template>
<script setup>
import { computed } from 'vue';

const emit = defineEmits(['delete']);
const props = defineProps({
  exList: {
    type: Object,
    require: true,
  },
  formatNumber: {
    type: Function,
    require: true,
  },
});

const imo = (item) => {
  if (item.item.includes('간식')) {
    return '🍭';
  } else if (item.item.includes('점심')) {
    return '🍽';
  }
};
</script>
