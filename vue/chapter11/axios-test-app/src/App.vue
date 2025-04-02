<template>
  <div>
    <h2>콘솔을 확인합니다.</h2>
  </div>
</template>

<script setup>
import axios from 'axios';

const listUrl = '/api/todos';
const todoUrlPrefix = '/api/todos/';

let todoList = [];
axios
  .get(listUrl)
  .then((response) => {
    todoList = response.data;
    console.log('todoList: ', todoList);
    //첫번째 가지고 오기
    return todoList[0].id;
  })
  .then((id) => {
    return axios.get(todoUrlPrefix + id);
  })
  .then((response) => {
    // 가지고온 첫번째 todo출력하고 두번째 todo id리턴
    console.log('첫번째: ', response.data);
    return todoList[1].id;
  })
  .then((id) => {
    // 두번째 todo 가지고 와서 출력
    axios.get(todoUrlPrefix + id).then((response) => {
      console.log('두번째: ', response.data);
    });
  });

// const requestAPI = () => {
//   //const url = 'http://localhost:3000/todos/1';
//   const url = '/api/todos/1';
//   //해당 url로 get메소드 보낸 수 응답 데이터 출력
//   axios.get(url).then((response) => {
//     console.log('#응답객체: ', response);
//   });
// };

// requestAPI();
</script>
