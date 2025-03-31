<template>
  <div @change="$emit('options-changed', size, extraShot, ice)">
    <div>
      사이즈: <br />
      <input type="radio" name="size" value="Small" v-model="size" /> Small
      <input type="radio" name="size" value="Medium" v-model="size" /> Medium
      <input type="radio" name="size" value="Large" v-model="size" /> Large
    </div>
    <div><input type="checkbox" v-model="extraShot" /> 샷 추가</div>
    <div>
      얼음 양:
      <select name="ice" id="" v-model="ice">
        <option value="보통" selected>보통</option>
        <option value="적게">적게</option>
        <option value="많이">많이</option>
      </select>
    </div>
  </div>
</template>
<script>
export default {
  name: 'DrinkOptions',
  data() {
    return {
      selectedDrink: this.selectedDrink,
      size: '',
      extraShot: null,
      ice: '보통',
    };
  },
  props: ['menus'],
};
</script>
<style scoped>
div {
  margin-top: 20px;
  margin-bottom: 20px;
}
</style>
