<template>
  <div>
    <!-- 체크박스 생성: value 속성은 id를 사용, checked 속성은 부모 컴포넌트로부터 전달된 checked 값을 사용 -->
    <!-- 체크박스 상태가 변경되면 'check-changed' 이벤트를 발생시키고, id와 체크된 상태를 부모 컴포넌트에 전달 -->
    <input
      type="checkbox"
      :value="id"
      :checked="checked"
      @change="$emit('check-changed', { id, checked: $event.target.checked })"
    />

    <slot>Item</slot>
  </div>
</template>

<script>
export default {
  name: 'CheckBox1', // 컴포넌트 이름
  props: ['id', 'checked', 'label'], // 부모 컴포넌트에서 전달받는 속성: id, checked 상태, 라벨 텍스트
};
</script>
