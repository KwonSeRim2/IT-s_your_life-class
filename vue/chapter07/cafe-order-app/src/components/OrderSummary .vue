<template>
  <h3>🧾 주문 내역서</h3>
  음료: {{ selectedDrink }}
</template>
<script>
export default {
  name: 'OrderSummary',
  props: 'selectedDrink',
};
</script>
