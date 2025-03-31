<template>
  <div>
    <slot name="icon"></slot>
    <input
      type="checkbox"
      :value="id"
      :checked="checked"
      @change="$emit('check-changed', { id, checked: $event.target.checked })"
    />

    <slot name="label">Item</slot>
  </div>
</template>

<script>
export default {
  name: 'CheckBox1', // 컴포넌트 이름
  props: ['id', 'checked', 'label'], // 부모 컴포넌트에서 전달받는 속성: id, checked 상태, 라벨 텍스트
};
</script>
