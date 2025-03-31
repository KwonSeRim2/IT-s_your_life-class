<template>
  <div class="container">
    <Header></Header>
    <NavBar></NavBar>
    <router-view></router-view>
  </div>
</template>

<script>
import Header from '@/components/Header.vue';
import NavBar from '@/components/NavBar.vue';

export default {
  name: 'App',
  components: { Header, NavBar },
};
</script>

<style>
.container {
  margin-top: 10px;
}
</style>
