<template>
  <div>
    <!-- 제목 출력 -->
    <h3>당신이 경험한 프론트 엔드 기술은?(첫번째:Slot사용(X))</h3>

    <!-- CheckBox1 컴포넌트를 사용하여 체크박스 리스트 출력 -->
    <!-- v-for을 사용해 items 배열의 각 항목에 대해 CheckBox1 컴포넌트를 생성 -->
    <!-- key는 각 항목의 id로 설정, props로 id, label, checked 값 전달 -->
    <!-- 체크박스 상태가 변경되면 'check-changed' 이벤트가 발생하고 CheckBoxChanged 메서드를 호출 -->
    <CheckBox2
      v-for="item in items"
      :key="item.id"
      :id="item.id"
      :label="item.label"
      :checked="item.checked"
      @check-changed="CheckBoxChanged"
      ><span v-if="item.checked" style="color: blue; text-decoration: underline"
        ><i>{{ item.label }}</i></span
      >
      <span v-else style="color: gray">{{ item.label }}</span>
    </CheckBox2>
  </div>
</template>

<script>
import CheckBox2 from './CheckBox1.vue'; // CheckBox1 컴포넌트 가져오기

export default {
  name: 'NoSlotTest', // 컴포넌트 이름
  components: { CheckBox2 }, // CheckBox1 컴포넌트 등록
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
