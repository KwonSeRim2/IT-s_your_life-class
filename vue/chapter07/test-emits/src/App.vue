<template>
  <div>
    <!-- 자식에서 보낸 이벤트 명과 동일해야한다. 이벤트 헨들러와 연결 -->
    <InputName3 @nameChanged="nameChangedHandler" />
    <br />
    <h3>App 데이터: {{ parentNamae }}</h3>
  </div>
</template>

<script>
import InputName3 from './components/InputName.vue';

export default {
  name: 'App4',
  components: { InputName3 },
  data() {
    return {
      parentNamae: '',
    };
  },
  methods: {
    nameChangedHandler(e) {
      // 자식에게서 받아온 name을 부모 컴포넌트에 출력해줌
      this.parentNamae = e.name;
    },
  },
};
</script>
