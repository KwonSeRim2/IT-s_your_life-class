<template>
  <Header></Header>
  <RouterView></RouterView>
</template>
<script setup>
import Header from '@/components/Header.vue';

components: {
  Header;
}
</script>
