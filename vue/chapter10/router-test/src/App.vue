<template>
  <div class="container">
    <Header></Header>
    <router-view></router-view>
  </div>
</template>

<script>
import Header from '@/components/Header.vue';

export default {
  name: 'App',
  components: { Header },
};
</script>

<style>
@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css');

.container {
  text-align: center;
  margin-top: 10px;
}

/* 기존 font-awesome 스타일 커스텀 */
.fa {
  padding: 5px;
  width: 30px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
}
.fa-facebook {
  background-color: #3b5998;
  color: white;
}
.fa-youtube {
  background-color: #bb0000;
  color: white;
}
.fa-instargram {
  background-color: #125688;
  color: white;
}
</style>
