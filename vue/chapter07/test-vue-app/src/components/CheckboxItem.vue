<!-- html 코드 들어감 -->
<template>
  <li><input type="checkbox" :checked="checked" />옵션 1</li>
</template>

<script>
export default {
  name: 'CheckboxItem',
  data() {
    return {
      checked: false,
    };
  },
};
</script>
