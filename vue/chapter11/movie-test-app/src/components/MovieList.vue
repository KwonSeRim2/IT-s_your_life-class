<template>
  <ul v-if="movielist.data.length">
    <li v-for="m in movielist.data" :key="m.id">
      🎬
      <router-link to="/movies/:id"
        >{{ m.title }} - {{ m.director }}</router-link
      >
    </li>
  </ul>
  <p v-else>🎬 영화 목록을 불러오는 중...</p>
</template>

<script setup>
import { inject } from 'vue';

const movielist = inject('getmovielist');
</script>
