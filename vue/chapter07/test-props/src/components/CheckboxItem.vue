<!-- html 코드 들어감 -->
<template>
  <!-- 체크박스의 체크여부(html 속성) = "부모한테서 받아온 불린값" -->
  <li><input type="checkbox" :checked="checked" />{{ name }}</li>
</template>

<script>
export default {
  name: 'CheckboxItem',

  //부모 컴포넌트에서 받아온 속성 매열
  props: ['name', 'checked'],
};
</script>
