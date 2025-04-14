<template>
  <div class="container">
    <Header> </Header>
    <router-view></router-view>
  </div>
</template>

<script setup>
import { useRouter } from 'vue-router';
import { reactive, computed, provide } from 'vue';
import Header from '@/components/Header.vue';
import axios from 'axios';

const BASEURL = '/api/todos';
const states = reactive({ todoList: [] });
const fetchTodoList = async () => {
  try {
    const response = await axios.get(BASEURL);
    if (response.status === 200) {
      states.todoList = response.data;
    } else {
      console.log('데이터 조회 실패');
    }
  } catch (error) {
    console.log('에러:' + error);
  }
};
//새로운 todoList를 추가합니다.
const addTodo = async ({ todo, desc }, successCallback) => {
  try {
    const payload = { todo, desc };
    const response = await axios.post(BASEURL, payload);
    if (response.status === 201) {
      states.todoList.push({ ...response.data, done: false }); //객체 참조 문제제
    } else {
      console.log('추가 실패');
    }
  } catch (error) {
    console.log('에러 발생: ' + error);
  }
};

const updateTodo = async ({ id, todo, desc, done }, successCallback) => {
  try {
    const payload = { id, todo, desc, done };
    const response = await axios.put(BASEURL + `/${id}`, payload);
    if (response.status === 200) {
      // 사용자에게 받아온 id와 같은 id찾기
      let index = states.todoList.findIndex((todo) => todo.id === id);
      states.todoList[index] = payload;
      successCallback;
    } else {
      console.log('수정 완료');
    }
  } catch (error) {
    console.log('에러 발생: ' + error);
  }
};

const deleteTodo = async ({ id }) => {
  try {
    const response = await axios.delete(BASEURL + `/${id}`);
    if (response.status === 200) {
      // 삭제할 todo가 todolist에서 몇변째 인텍스인지 id를 통해 검색
      let index = states.todoList.findIndex((todo) => todo.id === id);
      states.todoList.splice(index, 1);
    } else {
      console.log('todo 삭제 실패');
    }
  } catch (error) {
    console.log('에러 발생: ' + error);
  }
};

const toggleDone = async ({ id }) => {
  try {
    let todo = states.todoList.find((todo) => todo.id === id);
    let payload = { ...todo, done: !todo.done };
    const response = await axios.put(BASEURL + `/${id}`, payload);
    if (response.status === 200) {
      todo.done = payload.done;
    } else {
      console.log('Todo 완료 변경 실패');
    }
  } catch (error) {
    console.log('에러 발생: ' + error);
  }
};

provide(
  'todoList',
  computed(() => states.todoList)
);
provide('actions', { addTodo, updateTodo, deleteTodo, toggleDone });
</script>
