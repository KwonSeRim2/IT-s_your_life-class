<template>
  <div class="m-3">
    <h3>존재하지 않는 경로</h3>
    <p>요청 경로 : {{ currentRouter.path }}</p>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router';

const currentRouter = useRouter();
</script>
