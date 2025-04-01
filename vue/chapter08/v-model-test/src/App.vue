<template>
  <div>
    <!-- <InputName :name="searchName" @update:name="changeSearchName"></InputName>
    <h3>검색어: {{ searchName }}</h3> -->

    <!-- v-model 디렉티브를 사용하면 이벤트 수신 처리를 하지 않아도 됨 -->
    <InputName v-model:name="searchName"></InputName>
    <h3>검색어: {{ searchName }}</h3>
  </div>
</template>

<script>
import InputName from './components/InputName.vue';

export default {
  name: 'App',
  components: { InputName },
  data() {
    return { searchName: 'John' };
  },
  methods: {
    changeSearchName(name) {
      console.log(name); // 수정된 부분
      this.searchName = name;
    },
  },
};
</script>
