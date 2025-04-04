<template>
  <div class="card">
    <div class="card-title text-center text-primary">
      <h3>MBTI궁합 테스트</h3>
    </div>
    <div class="card-body flex">
      <p>나의 MBTI</p>
      <select name="" id="">
        <option value=""></option>
      </select>
      <p>친구의 MBTI</p>
      <select name="" id="">
        <option value=""></option>
      </select>
      <br />
      <button
        class="bg-primary m-5 p-2 text-white"
        style="width: 300px; border-radius: 7px; border: none"
      >
        궁합 계산
      </button>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';
</script>
