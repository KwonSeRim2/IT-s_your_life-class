<template>
  <div class="row">
    <div class="col-sm-5 border p-3 m-3" v-for="s in studyList" :key="s.id">
      <router-link :to="'/sudies/' + s.id">
        <div class="pb-2">
          <b>{{ s.title }}</b>
        </div>
        <div>
          📌카테고리: {{ s.category }} <br />
          📅등록일: {{ s.createdAt }} <br />
          📆마감일: {{ s.dueDate }} <br />
          ❤ 좋아요: {{ s.likes }} <br />
          <span class="badge bg-success">
            {{
              diff(s.dueDate).diffTime > 0
                ? `D-${diff(s.dueDate).diffDays}`
                : '모집 마감'
            }}
          </span>
        </div>
      </router-link>
    </div>
  </div>
</template>
<script setup>
import { inject } from 'vue';
import { computed } from 'vue';

const diff = (tdate) => {
  let diffTime = new Date(tdate) - new Date();
  let diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));
  return { diffTime, diffDays };
};
const studyList = inject('studyList');
</script>
