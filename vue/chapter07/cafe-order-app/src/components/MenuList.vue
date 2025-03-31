<template>
  <button @click="$emit('select-drink', { name: menus.name })" class="m-1 p-1">
    {{ menus.name }} ({{ menus.price }})
  </button>
</template>
<script>
export default {
  name: 'MenuList',
  props: ['menus'],
};
</script>
<style scoped>
button {
  border: 1px solid gray;
  border-radius: 5px;
}
</style>
