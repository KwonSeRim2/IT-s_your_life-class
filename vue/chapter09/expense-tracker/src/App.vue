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

const Add = (item, amount) => {
  total.value += Number(amount);

  exList.exItems.push({ item, amount });
};

const Out = (index) => {
  exList.exItems.splice(index, 1);
  console.log(index);
};

const formatNumber = (total) => {
  return total.toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ',');
};
</script>
