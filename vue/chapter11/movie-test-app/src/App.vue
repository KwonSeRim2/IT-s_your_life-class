<template>
  <h1>지브리 영화 리스트</h1>
  <MovieList></MovieList>
</template>

<script setup>
import axios from 'axios';
import { provide, reactive, onMounted } from 'vue';
import MovieList from './components/MovieList.vue';

const listUrl = '/api/movies';
const todoUrlPrefix = '/api/movies/';

const movieList = reactive({ data: [] });

const fetchMovies = async () => {
  try {
    const response = await axios.get(listUrl);
    movieList.data = response.data;
  } catch (error) {
    console.error('영화 목록을 불러오는 데 실패했습니다.', error);
  }
};

// 컴포넌트가 마운트될 때 데이터 불러오기
onMounted(fetchMovies);

// Provide로 데이터 제공
provide('getmovielist', movieList);
</script>
