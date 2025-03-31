<script>
import InputName from './components/InputName.vue';

export default {
  name: 'App4',
  components: { InputName },
  data() {
    return {
      parentNamae: '',
    };
  },
  methods: {
    nameChangedHandler(e) {
      this.parentNamae = e.name;
    },
  },
};
</script>

<template>
  <div>
    <InputName @nameChanged="nameChangedHandler" />
    <br />
    <h3>App 데이터: {{ parentNamae }}</h3>
  </div>
</template>
