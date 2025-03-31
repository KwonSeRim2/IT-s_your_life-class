<script setup>
import MenuList from './components/MenuList.vue';
import DrinkOptions from './components/DrinkOptions.vue';
import OrderSummary from './components/OrderSummary .vue';
</script>

<template>
  <div class="container">
    <h1>카페 주문 앱</h1>
    <h3>메뉴 선택</h3>
    <MenuList
      v-for="menus in menuList"
      :menus="menus"
      @select-drink="showSelectMenu"
    ></MenuList>
    <br />
    <div v-if="selectedDrink" class="m-1 p-3" id="selectShow">
      선택한 음료: {{ selectedDrink }}
    </div>
    <div v-if="selectedDrink">
      <div class="fild">
        <h3 class="my-3">{{ selectedDrink }} 옵션 션택</h3>
        <DrinkOptions @options-changed="showOption"> </DrinkOptions>
      </div>
      <div class="fild">
        현재 선택 옵션: <br />
        사이즈: {{ selectedOptions.size }} <br />
        추가샷: {{ selectedOptions.extraShot }} <br />
        얼음양: {{ selectedOptions.ice }}
      </div>
    </div>
    <div v-if="selectedDrink && selectedOptions.size" class="fild">
      <OrderSummary></OrderSummary>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App',
  components: { MenuList, DrinkOptions, OrderSummary },
  data() {
    return {
      menuList: [
        { name: '아메리카노', price: 4000 },
        { name: '카페라떼', price: 4500 },
        { name: '바닐라라떼', price: 4800 },
        { name: '콜드브루', price: 5000 },
      ],
      selectedDrink: '',
      selectedOptions: {
        size: '',
        extraShot: '',
        ice: '',
      },
    };
  },
  methods: {
    showSelectMenu(e) {
      this.selectedDrink = e.name;
    },
    showOption(size, extraShot, ice) {
      let shot = '';
      shot = extraShot ? '있음' : '없음';
      this.selectedOptions = { size, extraShot: shot, ice };
    },
  },
};
</script>
<style scoped>
#selectShow {
  border: 1px solid gray;
  border-radius: 7px;
}
.fild {
  background-color: beige;
  padding: 20px;
  margin-top: 10px;
  margin-bottom: 10px;
}
</style>
