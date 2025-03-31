<template>
  <div>
    <h3>당신이 경험한 프론트 엔드 기술은?(첫번째:Slot사용(X))</h3>

    <CheckBox3
      v-for="item in items"
      :key="item.id"
      :id="item.id"
      :label="item.label"
      :checked="item.checked"
      @check-changed="CheckBoxChanged"
    >
      <template #icon>
        <i v-if="item.checked" class="far fa-grin-beam"></i>
        <i v-else class="far fa-frown"></i>
      </template>
      <template #label>
        <span
          v-if="item.checked"
          style="color: blue; text-decoration: underline"
        >
          <i>{{ item.label }}</i>
        </span>
        <span v-else style="color: gray">{{ item.label }}</span>
      </template>
    </CheckBox3>
  </div>
</template>

<script>
import CheckBox3 from './CheckBox3.vue';

export default {
  name: 'NoSlotTest', // 컴포넌트 이름
  components: { CheckBox3 }, // CheckBox1 컴포넌트 등록
  data() {
    return {
      // items 배열: 프론트엔드 기술들의 체크박스 상태를 저장 (id, checked 상태, label)
      items: [
        { id: 'V', checked: true, label: 'Vue' }, // Vue는 기본적으로 선택된 상태
        { id: 'A', checked: false, label: 'Angular' }, // Angular는 선택되지 않은 상태
        { id: 'R', checked: false, label: 'React' }, // React는 선택되지 않은 상태
        { id: 'S', checked: false, label: 'Svelte' }, // Svelte는 선택되지 않은 상태
      ],
    };
  },
  methods: {
    // CheckBoxChanged 메서드: 체크박스 상태가 변경될 때 호출
    // 체크된 상태와 해당 id를 이벤트로 전달받아 items 배열에서 해당 항목의 checked 값을 업데이트
    CheckBoxChanged(e) {
      let item = this.items.find((item) => item.id === e.id); // id로 해당 항목을 찾음
      item.checked = e.checked; // 해당 항목의 checked 상태를 업데이트
    },
  },
};
</script>
<style>
@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css');
</style>
