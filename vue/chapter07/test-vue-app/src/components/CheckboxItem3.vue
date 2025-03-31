<!-- html 코드 들어감 -->
<template>
  <li><input type="checkbox" :checked="checked" />옵션 1</li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  props: {
    id: [Number, String], // num , string 타입
    name: String, // string 타입
    checked: {
      type: Boolean, // bool 타입
      required: false, //옵션
      default: false, //생략시 기본값은 false
    },
  },
};
</script>
