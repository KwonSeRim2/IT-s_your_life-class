<template>
  <div class="row">
    <div class="col p-3">
      <h2>할일 추가</h2>
    </div>
  </div>
  <div class="row">
    <div class="col">
      <div class="form-group">
        <label htmlFor="todo">할일: </label>
        <input
          type="text"
          id="todo"
          class="form-control"
          v-model="TodoItem.todo"
        />
      </div>
      <div class="form-group">
        <label htmlFor="desc">설명: </label>
        <textarea
          type="text"
          id="desc"
          class="form-control"
          v-model="TodoItem.desc"
        ></textarea>
      </div>
      <div class="form-group">
        <button
          type="button"
          id="desc"
          class="btn btn-primary m-1"
          @click="addTodoHandler"
        >
          추가
        </button>
        <button
          type="button"
          id="desc"
          class="btn btn-primary m-1"
          @click="router.push('/todos')"
        >
          취소
        </button>
      </div>
    </div>
  </div>
</template>
<script setup>
import TodoItem from '@/components/TodoItem.vue';
import { useRouter } from 'vue-router';
import { inject, reactive } from 'vue';

const router = useRouter();
const { addTodo } = inject('actions');
const todoItem = reactive({ todo: '', desc: '' });

const addTodoHandler = () => {
  let { todo } = todoItem;
  if (!todo || todo.trim() === '') {
    //  todo의 유효성 검사
    alert('할일을 반드시 입력해야 합니다');
    return;
  }
  addTodo({ ...todoItem }); //리스트의 목록페이
  router.push('/todos');
};
</script>
