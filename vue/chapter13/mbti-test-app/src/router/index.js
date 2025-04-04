import MatchTest from '@/pages/MatchTest.vue';
import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      redirect: '/test',
    },
    {
      path: '/test',
      component: MatchTest,
    },
  ],
});

export default router;
