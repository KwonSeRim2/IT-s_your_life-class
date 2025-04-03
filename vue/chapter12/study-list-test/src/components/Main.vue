<template>
  <h2>📚스터디 목록</h2>
  <span><input type="checkbox" />모집 중만 모기</span>
  <span>
    <select name="" id="" v-model="sort">
      <option value="a">마감일 임박순</option>
      <option value="b">최신 등록일순</option>
      <option value="c">좋아요순</option>
    </select>
  </span>
  <router-link to="/sudies">sudies</router-link>
</template>
<script setup></script>
