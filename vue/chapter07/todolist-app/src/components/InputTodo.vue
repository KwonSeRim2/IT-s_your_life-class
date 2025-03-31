<template>
  <div class="row mb-3">
    <div class="col">
      <div class="input-group">
        <input
          type="text"
          class="form-control"
          placeholder="할일을 여기에 입력!"
          v-model.trim="todo"
          @keyup.enter="addTodoHandler"
        />
        <span class="btn btn-primary input-group-addon" @click="addTodoHandler"
          >추가</span
        >
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const todo = ref('');
const emit = defineEmits(['add-todo']);

const addTodoHandler = () => {
  if (todo.value.length >= 2) {
    emit('add-todo', todo.value); // 부모 컴포넌트로 이벤트 전달
    todo.value = ''; // 입력 필드 초기화
  }
};
</script>
