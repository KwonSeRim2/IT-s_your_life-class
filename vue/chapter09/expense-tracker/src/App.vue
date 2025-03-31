<template>
  <div
    style="margin: 20px; padding: 50px; background-color: black; color: white"
  >
    <h1 style="color: aquamarine">🧩Simple Budget Diary</h1>
    <ExpenseForm @submit1="Add"></ExpenseForm>
    <div style="margin: 8px">🧨지출 내역</div>

    <ExpenseList
      @delete="Out"
      :exList="exList"
      :formatNumber="formatNumber"
    ></ExpenseList>
    <div>♟️카테고리별 지출 합계</div>
    <div>
      <div
        class="d-flex"
        style="
          background-color: #1e1e1e;
          margin: 5px;
          border-radius: 5px;
          padding: 8px;
        "
        v-if="cateTotal.a > 0"
      >
        🥤식비: {{ formatNumber(cateTotal.a) }}원
      </div>
      <div
        class="d-flex"
        style="
          background-color: #1e1e1e;
          margin: 5px;
          border-radius: 5px;
          padding: 8px;
        "
        v-if="cateTotal.b > 0"
      >
        🚌교통: {{ formatNumber(cateTotal.b) }}원
      </div>
      <div
        class="d-flex"
        style="
          background-color: #1e1e1e;
          margin: 5px;
          border-radius: 5px;
          padding: 8px;
        "
        v-if="cateTotal.c > 0"
      >
        🛍️쇼핑: {{ formatNumber(cateTotal.c) }}원
      </div>
      <div
        class="d-flex"
        style="
          background-color: #1e1e1e;
          margin: 5px;
          border-radius: 5px;
          padding: 8px;
        "
        v-if="cateTotal.d > 0"
      >
        🧭취미: {{ formatNumber(cateTotal.d) }}원
      </div>
    </div>
    <TotalDisplay :total="total" :formatNumber="formatNumber"></TotalDisplay>
  </div>
</template>

<script setup>
import { ref, reactive, computed } from 'vue';

import ExpenseForm from './components/ExpenseForm.vue';
import TotalDisplay from './components/TotalDisplay.vue';
import ExpenseList from './components/ExpenseList.vue';

const total = ref(0);
const exList = reactive({ exItems: [] });

const Add = (item, amount, id) => {
  total.value += Number(amount);

  exList.exItems.push({ item, amount, id });
};

const Out = (index) => {
  exList.exItems.splice(index, 1);
  console.log(index);
};

const formatNumber = (total) => {
  return total.toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ',');
};

// 카테고리별 합계를 계산하여 바로 반환하는 computed 함수
const cateTotal = computed(() => {
  return {
    a: exList.exItems
      .filter((item) => item.id === 1)
      .reduce((sum, current) => sum + Number(current.amount), 0),
    b: exList.exItems
      .filter((item) => item.id === 2)
      .reduce((sum, current) => sum + Number(current.amount), 0),
    c: exList.exItems
      .filter((item) => item.id === 3)
      .reduce((sum, current) => sum + Number(current.amount), 0),
    d: exList.exItems
      .filter((item) => item.id === 4)
      .reduce((sum, current) => sum + Number(current.amount), 0),
  };
});
</script>
