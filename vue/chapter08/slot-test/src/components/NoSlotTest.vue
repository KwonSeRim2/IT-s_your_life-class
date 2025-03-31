<template>
  <div>
    <h3>단신이 경험한 프론트 기술은? (첫번째 : slot사용x)</h3>
  </div>
</template>
<script>
import CheckBox1 from './CheckBox1.vue';

export default {
    name: 'NoSlotTest',
    data() {
        return {
            items: [
                {id: 'v', checked: true, label: 'vue'},
                {id: 'a', checked: false, label: 'vue'},
                {id: 'r', checked: false, label: 'vue'},
                {id: 's', checked: false, label: 'vue'}

            ]
        }
    },
    methods: {
        CheckBoxChanged(e){
            //받아온 객체의 id를 items배열에서 찾아서 일치하는 객체 반환
            let item = this.items.find(())
            //찾은 객체의 checked를 받아온 값으로 변경
        }
    }
}
</script>
