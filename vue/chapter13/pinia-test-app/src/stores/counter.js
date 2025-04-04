import { ref, computed, reactive } from 'vue';
import { defineStore } from 'pinia';

export const useCounterStore = defineStore('counter', () => {
  const count = ref(0);
  const doubleCount = computed(() => count.value * 2);
  function increment() {
    count.value++;
  }

  return { count, doubleCount, increment };

  // ref, reactive로 정의한 값은 state로
  // computed로 정의 한 겂은 읽기전용이라 getters로 나옴
});
