<template>
  <div>
    <h2>관심있는 k-pop가수</h2>
    <hr />
    <ul>
      <!-- 컴포넌트로 등록한 사용자 정의 태그 -->
      <!-- :name 과 :checked는 자식에게 전달할 props -->
      <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>
  </div>
</template>

<script>
import CheckboxItem from './components/CheckboxItem.vue';

//얘도 결국 컴포넌트라 export
export default {
  name: 'App',
  //지역 컴포넌트 등록 , 해당 뷰에서만 사용가능
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        { id: 2, name: 'Black Pink', checked: false },
        { id: 3, name: 'EXO', checked: false },
        { id: 4, name: 'ITZY', checked: false },
      ],
    };
  },
};
</script>

<!-- scoped: 이 파일에서반 스타일 지정하겠다 -->
<style scoped></style>
