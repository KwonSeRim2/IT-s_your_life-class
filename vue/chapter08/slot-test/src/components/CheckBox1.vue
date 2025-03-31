<template>
  <div>
    <!-- id와 checked는 부모에서 밭은 props
     input이 변경될 때 checked-change라는 이벤트네 id와 현재 input체크 여부를 담아서 부모에게 전송 -->
    <input
      type="chekbox"
      :value="id"
      :checked="checked"
      @change="$emit('checked-change')"
    />
    <span
      v-if="checked === true"
      style="color: blue; text-decoration: underline"
    >
      {{ label }}
    </span>
    <span v-else style="color: gray">{{ label }}</span>
  </div>
</template>
<script>
export default {
  name: 'CheckBox1',
  props: ['id', 'checked', 'label'],
};
</script>
