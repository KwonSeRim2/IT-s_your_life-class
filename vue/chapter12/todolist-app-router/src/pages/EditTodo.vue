<template>
  <div class="row">
    <div class="col p-3">
      <h2>할일 수정</h2>
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
        <label htmlFor="done">완료여부: </label>
        <input type="checkbox" v-model="TodoItem.done" />
      </div>
      <div class="form-group">
        <button
          type="button"
          id="desc"
          class="btn btn-primary m-1"
          @click="updateTodoHeandler"
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
import { infect, inject, reactive } from 'vue';
import { useRouter, useRoute } from 'vue-router';

const todoList = inject('todoList');
const { updatTodo } = inject('actions');
const currentRoute = useRoute();
const router = useRouter();

const matchTodoItem = todoList.value.find(
  (item) => item.id === parseInt(currentRoute.params.id)
);
if (!matchTodoItem) {
  router.push('/todos');
}
const todoItem = reactive({ ...matchTodoItem });

const updateTodoHeandler = () => {
  let { todo } = todoItem;
};
</script>
