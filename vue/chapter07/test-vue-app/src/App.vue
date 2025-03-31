<template>
  <div>
    <h2>App 컴포넌트</h2>
    <hr />
    <ul>
      <!-- 컴포넌트로 등록한 사용자 정의 태그 -->
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
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
      idols: [{ id: 1, name: 'BTS', checked: true }],
    };
  },
};
</script>

<!-- scoped: 이 파일에서반 스타일 지정하겠다 -->
<style scoped></style>
