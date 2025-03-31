<template>
  <div>
    <NoSlotTest></NoSlotTest>
    <SlotTest></SlotTest>
    <NamedSlotTest></NamedSlotTest>
  </div>
</template>
<script>
import NoSlotTest from './components/NoSlotTest.vue';
import SlotTest from './components/SlotTest.vue';
import NamedSlotTest from './components/NamedSlotTest.vue';

export default {
  nema: 'App',
  components: { NoSlotTest, SlotTest, NamedSlotTest },
};
</script>
