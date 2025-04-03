<template>
  <div class="container">
    <Main></Main>
    <router-view></router-view>
  </div>
</template>
<script setup>
import Main from './components/Main.vue';
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
