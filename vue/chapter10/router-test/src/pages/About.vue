<template>
  <div class="card card-body"></div>
  <h2>About</h2>
  <!-- 혅재 라우트 객체의 전체 경로 -->
  <p>요청 경로 : {{ $route.fullPath }}</p>
</template>
<script>
export default {
  name: 'About',
  created() {
    console.log(this.$route);
  },
};
</script>
