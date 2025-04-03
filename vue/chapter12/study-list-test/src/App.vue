<template>
  <div class="container">
    <h2>📚스터디 목록</h2>
    <span><input type="checkbox" />모집 중만 모기</span>
    <span>
      <select name="" id="" v-model="sort">
        <option value="a">마감일 임박순</option>
        <option value="b">최신 등록일순</option>
        <option value="c">좋아요순</option>
      </select>
    </span>
    <router-view></router-view>
  </div>
</template>
<script setup>
import axios from 'axios';
import { ref, provide, reactive, onMounted, computed } from 'vue';
import Studies from './pages/Studies.vue';

const listUrl = '/api/movies';
const todoUrlPrefix = '/api/movies/';

const sort = ref('a');
const studyList = reactive({ data: [] });

const sortedStudies = computed(() => {
  console.log('정렬 실행' + sort.value);
  return [...studyList.data].sort((a, b) => {
    if (sort.value === 'a') return a.dueDate - b.dueDate;
    else if (sort.value === 'b')
      return new Date(b.createdAt) - new Date(a.createdAt);
    else if (sort.value === 'c') return new Date(b.likes) - new Date(a.likes);
  });
});

const fetchStudies = async () => {
  try {
    const response = await axios.get('/api/studies');
    studyList.data = response.data;
  } catch (error) {
    console.log('데이터 로딩x');
  }
};

onMounted(fetchStudies);

provide('studyList', sortedStudies);
</script>
