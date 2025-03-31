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
    <span>
      <select
        name="category"
        id=""
        style="
          margin: 5px;
          padding: 10px;
          background-color: #1e1e1e;
          border-radius: 7px;
          color: gray;
        "
        v-model="id"
      >
        <option
          v-for="(item, index) in category.cate"
          :key="index"
          :value="item.id"
        >
          {{ item.name }}
        </option>
      </select>
    </span>
    <span
      ><button
        type="submit"
        style="
          padding: 8px;
          border-radius: 5px;
          background-color: aquamarine;
          margin: 5px;
        "
        @click="emit('submit1', item, amount, id)"
      >
        추가
      </button></span
    >
  </div>
</template>
<script setup>
import { reactive, ref } from 'vue';

const category = reactive({
  cate: [
    {
      name: '카테고리 선택',
      id: 0,
    },
    { name: '식비', id: 1 },
    { name: '교통', id: 2 },
    { name: '쇼핑', id: 3 },
    { name: '취미', id: 4 },
  ],
});
const item = ref('');
const amount = ref();
const id = ref(0);

const emit = defineEmits(['submit1']);
</script>
