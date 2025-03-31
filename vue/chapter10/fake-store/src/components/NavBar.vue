<template>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
      <ul class="navbar-nav">
        <li class="nav-item">
          <router-link class="nav-link active" to="/">Fake Store</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/electronics">가전</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/jewelery">주얼리</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/mensclothing"
            >남성의류</router-link
          >
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/womenclothing"
            >여성의류</router-link
          >
        </li>
      </ul>
    </div>
  </nav>
</template>
<script>
import index from '@/config/index.js';

export default {
  name: 'NavBar',
};
</script>
