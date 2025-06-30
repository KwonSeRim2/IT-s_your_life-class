<script setup>
import MenuItem from './MenuItem.vue';
const props = defineProps({
  menus: { type: Array, required: true },
});
console.log(props.menus);
</script>

<template>
  <ul class="navbar-nav">
    <MenuItem v-for="menu in menus" :menu="menu"></MenuItem>
  </ul>
</template>
